package StephensAlgorithms.LinkedListAlgorithms;

public class List {
    private ListItem head;
    private ListItem tail;

    void addToFront(int data) {
        ListItem a = new ListItem();
        a.data = data;
        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }

    void addToBack(int data) {
        ListItem a = new ListItem();
        a.data = data;

        if (tail == null) {
            head = a;
        } else {
            tail.next = a;
        }
        tail = a;
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
}
