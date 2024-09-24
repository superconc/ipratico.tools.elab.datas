#!/bin/bash

# Cambia questa variabile con il percorso della cartella che vuoi usare
DIRECTORY="/Users/samuele/git/repository-ipratico/tools.elab.datas/src/main/java/ipratico/tools/elab/datas/json/model/call1_KO"

# Spostati nella cartella
cd "$DIRECTORY"

# Rinomina tutti i file con estensione .java in .java.old
for file in *.java; do
  mv "$file" "${file}.old"
done

echo "Rinomina completata!"
