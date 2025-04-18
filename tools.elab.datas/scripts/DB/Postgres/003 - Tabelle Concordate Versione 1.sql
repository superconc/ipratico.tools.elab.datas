CREATE SEQUENCE closed_payment_session_id_seq;

CREATE TABLE closed_payment_session (
    id INTEGER NOT NULL DEFAULT nextval('closed_payment_session_id_seq') PRIMARY KEY,
    cas VARCHAR,
    appVersion VARCHAR,
    type VARCHAR,
    deviceId VARCHAR,
    documentType VARCHAR,
    creditTotal FLOAT DEFAULT 0,
    orderId VARCHAR,
    billNumber VARCHAR,
    surchargesTotal FLOAT DEFAULT 0,
    hasEdoc BOOLEAN,
    fixedByApp BOOLEAN,
    businessMemberId VARCHAR,
    didScanGiftBill BOOLEAN,
    deviceName VARCHAR,
    zNumber VARCHAR,
    purpose VARCHAR,
    closedOrderId VARCHAR,
    paymentsTotal FLOAT,
    receiptAmount FLOAT,
    closureDate TIMESTAMP,
    closureId VARCHAR,
    referenceDate TIMESTAMP,
    referenceWeekDay INTEGER,
    successfullyPrintedOnFiscal BOOLEAN
);

-- Aggiorna la sequenza per partire dal massimo ID già presente nella tabella
SELECT setval('closed_payment_session_id_seq', COALESCE((SELECT MAX(id)+1 FROM closed_payment_session), 1), false);

-- -------------------------------------------------- -- 

CREATE TABLE vat_resume (
    closed_payment_session_id INTEGER REFERENCES closed_payment_session(id),
    rate FLOAT,
    shortName VARCHAR,
    tax FLOAT,
    netValue FLOAT,
    taxedValue FLOAT,
    vatRecordCategoryId VARCHAR,
    vatRecordCategoryName VARCHAR,
    PRIMARY KEY (closed_payment_session_id, vatRecordCategoryId)
);

-- ------------------------------------------------- --

CREATE TABLE payments (
    closed_payment_session_id INTEGER REFERENCES closed_payment_session(id),
    createdDate TIMESTAMP,
    amount FLOAT,
    isPaymentWithFidelityCard BOOLEAN,
    originalPaymentId VARCHAR,
    moneyTypeName VARCHAR,
    moneyTypeId VARCHAR,
    PRIMARY KEY (closed_payment_session_id, originalPaymentId)
);

-- ------------------------------------------------ --
CREATE TABLE printed_order_items (
    closed_payment_session_id INTEGER REFERENCES closed_payment_session(id),
    orderId VARCHAR,
    orderItemName VARCHAR,
    productId VARCHAR,
    productCategoryId VARCHAR,
    quantity INTEGER,
    finalNetPrice FLOAT,
    finalPrice FLOAT,
    vatRecordCategoryId VARCHAR,
    vatRecordCategoryName VARCHAR,
    PRIMARY KEY (closed_payment_session_id, orderId, productId)
);

