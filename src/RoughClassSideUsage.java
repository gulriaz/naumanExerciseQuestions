public class RoughClassSideUsage {
    private String message;
    private int rangeStart;
    private int rangeEnd;

    public static String readValidIntFromRange(String message, int rangeStart, int rangeEnd) {
        String messageRetrieved=null;
        StringBuilder str = new StringBuilder();
        if(rangeStart>=0 && rangeStart<=(message.length())-1){
            if(rangeEnd<=((message.length())-1) && rangeEnd>=0){
                    while(rangeStart<=rangeEnd){

                        str.append(message.charAt(rangeStart));
                        messageRetrieved=str.toString();

                        rangeStart++;
                    }
            }

        }else throw new IllegalArgumentException("!!!Invalid range given!!!");

        return messageRetrieved;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(int rangeStart) {
        this.rangeStart = rangeStart;
    }

    public int getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(int rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

}
