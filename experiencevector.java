
String experience= System.getProperty("user.home") +
        new String("/experience/");
        File file = new File(experience);

        SentenceIterator iter = new FileSentenceIterator(new SentencePreProcessor() {
@Override
public String preProcess(String sentence) {
        return new
        InputHomogenization(sentence).transform();
        }
        },file);
        
TokenizerFactory t = new UimaTokenizerFactory();

        Word2Vec vec = new Word2Vec.Builder().windowSize(5).layerSize(400).iterate(iter).tokenizerFactory(t).build();
        vec.fit();

