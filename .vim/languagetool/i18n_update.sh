#!/bin/sh
# Download latest translations from crowdin and copy them over the existing local files.
# Note that you need to trigger crowdin export via API if you need to make sure everything
# is up-to-date (automatic export may only happen every 24 hours).

#cd ~/workspace/JLanguageTool
mkdir i18n-temp
cd i18n-temp
wget http://crowdin.net/download/project/languagetool.zip
unzip languagetool.zip

for lang in be  ca  cs  da  de  es-ES  fr  gl  is  it  lt  nl  pl  ro  ru  sk  sl  sv-SE  uk
do
  SOURCE="$lang/MessagesBundle.properties"
	TARGET="../src/java/de/danielnaber/languagetool/MessagesBundle_${lang}.properties"
	echo "Copying $SOURCE to $TARGET"
	cp $SOURCE $TARGET
done

#cd ..
#rm -r i18n-temp
