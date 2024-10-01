final class Flag {
    private boolean flag = true;

    public synchronized void toggle() {
        flag ^= true;
    }

    public synchronized boolean getFlag() {
        return flag;
    }
}