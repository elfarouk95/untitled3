package com.company;

public class Node
{
    private Contact contact; // name, phone
    private Node next;
    private Node prev;

    public Node() {
        contact = new Contact();
    }

    public Contact getContact() {
        return contact;
    }
    public Node getNext() {
        return next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }


}


