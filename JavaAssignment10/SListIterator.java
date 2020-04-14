package JavaAssignment10;

public class SListIterator<T> extends SList<T>{
    public void insert(Node<T> node) {
        node.setNext(head);
        head = node;
    }

    public void remove(){
        if(head.getNext()!=null)
            head = head.getNext();
        else head = null;
    }

    private void printList(Node<T> node) {
        System.out.println("Node is " + node.getValue());
        if(node.getNext()!=null) printList(node.getNext());
    }
    public void ToString(){
        System.out.println("::::::::::::::");
        printList(head);
    }


    public static void main(String[] args) {
        SListIterator<String> list = new SListIterator<>();
        list.insert(new Node<String>("Nishitha"));
        list.insert(new Node<String>("Neha"));
        list.insert(new Node<String>("Sanath"));

        list.ToString();
        list.remove();
        list.ToString();

    }

}
