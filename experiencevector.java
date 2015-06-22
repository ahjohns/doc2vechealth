
String experience= System.getProperty("user.home") +
        new String("/experience");
        File file = new File(experience);

        SentenceIterator iter = new FileSentenceIterator(new SentencePreProcessor() {
@Override
public String preProcess(String sentence) {
        return new
        InputHomogenization(sentence).transform();
        }
        },file);