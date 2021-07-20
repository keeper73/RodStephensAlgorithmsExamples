package StephensAlgorithms.LinkedListAlgorithms;

public class List {
    private ListItem head;

    public void addToFront(int data) {
        ListItem a = new ListItem();
        a.data = data;
        if (head != null) {
            a.next = head;
        }
        head = a;
    }

    public void addToBack(int data) {
        ListItem a = new ListItem();
        a.data = data;
        if (head == null) {
            head = a;
        } else {
            ListItem top = this.head;
            while (top.next != null) {
                top = top.next;
            }
            top.next = a;
        }

    }

    public ListItem addToBackAndReturn(int data) {
        ListItem a = new ListItem();
        a.data = data;
        if (head == null) {
            head = a;
        } else {
            ListItem top = this.head;
            while (top.next != null) {
                top = top.next;
            }
            top.next = a;
        }
        return a;
    }

    void addCycleItemToBack(int data, ListItem cyclePoint) {
        ListItem a = new ListItem();
        a.data = data;
        a.next = cyclePoint;

        ListItem top = this.head;
        while (top.next != null) {
            top = top.next;
        }
        top.next = a;

    }

    public String printList() {
        StringBuilder result = new StringBuilder();
        ListItem top = this.head;
        while (top != null) {
            result.append(top.data).append(" ");
            top = top.next;
        }
        return result.toString().trim();
    }

    public boolean loopCheckWithRabbitAndTurtle() {
        ListItem rabbit = this.head;
        ListItem turtle = this.head;
        while (true) {
            if (rabbit.next != null) {
                turtle = turtle.next;
                rabbit = rabbit.next;
                if (rabbit.next != null) {
                    rabbit = rabbit.next;
                } else {
                    return false;
                }
                if (turtle == rabbit) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
