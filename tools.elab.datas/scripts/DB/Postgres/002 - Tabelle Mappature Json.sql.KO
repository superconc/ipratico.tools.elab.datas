CREATE TABLE category (
    category_id VARCHAR PRIMARY KEY,
    name VARCHAR NOT NULL,
    family_id VARCHAR,
    FOREIGN KEY (family_id) REFERENCES family(family_id)
);


CREATE TABLE family (
    family_id VARCHAR PRIMARY KEY,
    name VARCHAR NOT NULL
);


CREATE TABLE log (
    created_date VARCHAR PRIMARY KEY,
    modified_date VARCHAR,
    created_by VARCHAR,
    modified_by VARCHAR,
    shared VARCHAR,
    application VARCHAR,
    app_version VARCHAR,
    responsible_device VARCHAR
);


CREATE TABLE payment (
    created_date VARCHAR PRIMARY KEY,
    amount DOUBLE PRECISION NOT NULL,
    is_payment_with_fidelity_card VARCHAR,
    original_payment_id VARCHAR,
    transaction_detail_id VARCHAR,
    FOREIGN KEY (transaction_detail_id) REFERENCES transaction_detail(money_type_id)
);


CREATE TABLE payment_session (
    id VARCHAR PRIMARY KEY,
    cas VARCHAR NOT NULL,
    value_id VARCHAR,
    FOREIGN KEY (value_id) REFERENCES value(order_id)
);


CREATE TABLE printed_order_item (
    _id VARCHAR PRIMARY KEY,
    log_id VARCHAR,
    type VARCHAR,
    order_id VARCHAR,
    sale_type_id VARCHAR,
    price_list_id VARCHAR,
    item_type VARCHAR,
    mutated VARCHAR,
    is_subtotal VARCHAR,
    is_from_numpad VARCHAR,
    quantity INTEGER,
    subaccount_id INTEGER,
    is_from_bill VARCHAR,
    sale_item_id VARCHAR,
    order_item_name VARCHAR,
    is_from_proglove VARCHAR,
    course INTEGER,
    surcharges_total DOUBLE PRECISION,
    discounts_total DOUBLE PRECISION,
    product_id VARCHAR,
    price_list_name VARCHAR,
    final_net_price DOUBLE PRECISION,
    sale_type_name VARCHAR,
    no_fiscality VARCHAR,
    final_price DOUBLE PRECISION,
    computed_unitary_price DOUBLE PRECISION,
    final_price_with_session_discounts DOUBLE PRECISION,
    final_price_with_session_discounts_and_surcharges DOUBLE PRECISION,
    original_order_item_id VARCHAR,
    printed_order_item_name VARCHAR,
    vat_record_category_id VARCHAR,
    FOREIGN KEY (log_id) REFERENCES log(created_date),
    FOREIGN KEY (subaccount_id) REFERENCES subaccount(index),
    FOREIGN KEY (sale_item_id) REFERENCES sale_item(product_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id),
    FOREIGN KEY (vat_record_category_id) REFERENCES vat_record_category(name)
);



CREATE TABLE product (
    product_id VARCHAR PRIMARY KEY,
    name VARCHAR NOT NULL,
    category_id VARCHAR,
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);


CREATE TABLE sale_item (
    product_id VARCHAR PRIMARY KEY,
    vat_record_category_id VARCHAR
);


CREATE TABLE subaccount (
    index INTEGER PRIMARY KEY,
    name VARCHAR NOT NULL
);


CREATE TABLE transaction_detail (
    money_type_id VARCHAR PRIMARY KEY,
    money_type_name VARCHAR NOT NULL
);


CREATE TABLE value (
    order_id VARCHAR PRIMARY KEY,
    log_id VARCHAR,
    app_version VARCHAR,
    type VARCHAR,
    device_id VARCHAR,
    document_type VARCHAR,
    credit_total DOUBLE PRECISION,
    bill_number VARCHAR,
    surcharges_total DOUBLE PRECISION,
    has_edoc VARCHAR,
    fixed_by_app VARCHAR,
    business_member_id VARCHAR,
    did_scan_gift_bill BOOLEAN,
    device_name VARCHAR,
    discounts_total DOUBLE PRECISION,
    z_number VARCHAR,
    purpose VARCHAR,
    closed_order_id VARCHAR,
    payments_total DOUBLE PRECISION,
    receipt_amount DOUBLE PRECISION,
    fixed_by_additional_check_on_connection_error VARCHAR,
    needs_to_be_fiscalized VARCHAR,
    original_order_log_created_date VARCHAR,
    original_order_total DOUBLE PRECISION,
    print_session_identifier VARCHAR,
    responsible_device_id VARCHAR,
    successfully_printed_on_fiscal VARCHAR,
    variable_costs_total DOUBLE PRECISION,
    closure_date VARCHAR,
    closure_id VARCHAR,
    reference_date VARCHAR,
    reference_week_day INTEGER,
    FOREIGN KEY (log_id) REFERENCES log(created_date)
);


CREATE TABLE vat_record_category (
    name VARCHAR PRIMARY KEY,
    rate INTEGER NOT NULL,
    short_name VARCHAR
);


CREATE TABLE vat_resume (
    vat_record_category_id VARCHAR PRIMARY KEY,
    rate INTEGER NOT NULL,
    short_name VARCHAR,
    tax DOUBLE PRECISION,
    net_value DOUBLE PRECISION,
    taxed_value DOUBLE PRECISION,
    vat_record_category_name VARCHAR
);
