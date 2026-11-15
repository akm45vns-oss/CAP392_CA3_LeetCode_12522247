class BrowserHistory {
    ArrayList<String> a = new ArrayList<>();
    int b=0;
    public BrowserHistory(String homepage) {
        a.add(homepage);
    }
    public void visit(String url) {
        while (a.size()>b+1){
            a.remove(a.size()-1);
        }
        a.add(url);
        b++;
    }
    public String back(int steps) {
        b=b-steps;
        if (b<0) {
            b=0;
        }
        return a.get(b);
    }
    public String forward(int steps) {
        b=b+steps;
        if(b>=a.size()){
            b=a.size()-1;
        }
       return a.get(b);
    }
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
