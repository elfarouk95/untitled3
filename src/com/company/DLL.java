package com.company;

public class DLL  // Doubly Linked List
{
    private Node Head;
    int size = 0;

    public void Add(Contact c) {
        Node s = new Node();
        s.setContact(c);
        s.setNext(Head);

        if (Head != null)
            Head.setPrev(s);

        Head = s;
        size++;
    } // Unsorted



    boolean isLarger(String a, String b)
    {
        if (a.compareTo(b) > 0)
            return true;
        else
            return false;
    }

    public void AddSorted(Contact c) {
        if (Head == null || isLarger(Head.getContact().getName(), c.getName()))
        {
            Node s = new Node();
            s.setContact(c);
            s.setNext(Head);

            if (Head != null)
                Head.setPrev(s);

            Head = s;
            size++;
        }
        else
            {

            Node e = Head;
            while (e.getNext() != null && isLarger(c.getName(), e.getNext().getContact().getName())) {
                e = e.getNext();
            }


            Node s = new Node();
            s.setContact(c);
            s.setNext(e.getNext());
            s.setPrev(e);

            if (s.getNext() != null)
                s.getNext().setPrev(s);

            e.setNext(s);
            size++;

        }
    }




    public void PrintList() {
        Node e = Head;
        while (e != null) {
            System.out.println(e.getContact());
            e = e.getNext();
        }
    }

    public Contact SearchByName(String name) {
        Node e = Head;
        while (e != null)
        {
            if (e.getContact().getName().equals(name))
            {
                return e.getContact();
            }

            e = e.getNext();
        }
        return null;
    }

    public Contact SearchByPhone(String phone) {
        Node e = Head;
        while (e != null) {
            if (e.getContact().getPhone().equals(phone)) {
                return e.getContact();
            }
            e = e.getNext();
        }
        return null;
    }

    public void UpdateContactByPhone(String phone, Contact c) {
        Node e = Head;
        while (e != null) {
            if (e.getContact().getPhone().equals(phone)) {
                e.setContact(c);
            }
            e = e.getNext();
        }
    }

    public void UpdateContactByName(String Name, Contact c) {
        Node e = Head;
        while (e != null) {
            if (e.getContact().getName().equals(Name)) {
                e.setContact(c);
            }
            e = e.getNext();
        }
    }

    public void DeleteItem(String Name) {
        if (Head == null) {
            return;
        }
        if (Head.getContact().getName().equals(Name)) {
            Head = Head.getNext(); // First Node

        } else {
            Node temp = Head;
            while (temp.getNext() != null &&
                    !temp.getNext().getContact().getName().equals(Name)) {

                temp = temp.getNext();
            }
            if (temp.getNext() != null)
                temp.setNext(temp.getNext().getNext());
        }
    }
}
