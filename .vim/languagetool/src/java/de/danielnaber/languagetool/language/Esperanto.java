/* LanguageTool, a natural language style checker 
 * Copyright (C) 2007 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package de.danielnaber.languagetool.language;

import java.util.*;

import de.danielnaber.languagetool.Language;
import de.danielnaber.languagetool.rules.*;
import de.danielnaber.languagetool.rules.fr.QuestionWhitespaceRule;
import de.danielnaber.languagetool.tagging.Tagger;
import de.danielnaber.languagetool.tagging.eo.EsperantoTagger;
import de.danielnaber.languagetool.tokenizers.SentenceTokenizer;
import de.danielnaber.languagetool.tokenizers.SRXSentenceTokenizer;

public class Esperanto extends Language {

  private final Tagger tagger = new EsperantoTagger();
  private final SentenceTokenizer sentenceTokenizer = new SRXSentenceTokenizer(getShortName());

  @Override
  public Locale getLocale() {
    return new Locale("eo");
  }

  @Override
  public final SentenceTokenizer getSentenceTokenizer() {
    return sentenceTokenizer;
  }

  @Override
  public String getName() {
    return "Esperanto";
  }

  @Override
  public String getShortName() {
    return "eo";
  }

  @Override
  public String[] getCountryVariants() {
    /* return "ANY" country code as a "country-less" placeholder for OOo: */
    return new String[] {"ANY"};
  }
  
  @Override
  public Tagger getTagger() {
    return tagger;
  }

  @Override
  public Contributor[] getMaintainers() {
    final Contributor dPelle = new Contributor("Dominique Pellé");
    dPelle.setUrl("http://dominiko.livejournal.com/tag/lingvoilo");
    return new Contributor[] { dPelle };
  }

  @Override
  public List<Class<? extends Rule>> getRelevantRules() {
    return Arrays.asList(
            CommaWhitespaceRule.class,
            DoublePunctuationRule.class,
            GenericUnpairedBracketsRule.class,
            UppercaseSentenceStartRule.class,
            WordRepeatRule.class,
            WhitespaceRule.class,
            QuestionWhitespaceRule.class
    );
  }

}
