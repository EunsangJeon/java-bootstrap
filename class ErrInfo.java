class Err {
    public String msg;
    public int severity;

    public Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    private String msgs[] = {
        "Output Error",
        "Input Error",
        "Disk Full",
        "Index Out-Of-Bounds"
    };
    private int howBad[] = { 2, 1, 3, 4 };

    Err getErrorInfo(int i) {
        if(i >= 0 && i < msgs.length) {
            return new Err(msgs[i], howBad[i]);
        }
        return new Err("Invalid Error Code", 0);
    }
}

class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();
        Err e = err.getErrorInfo(2);
        System.out.println(e.msg + " " + e.severity);
    }
}
