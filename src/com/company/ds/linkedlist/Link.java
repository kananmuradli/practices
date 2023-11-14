package com.company.ds.linkedlist;

public class Link {

    public String bookName;
    public int millionsSold;
    public Link next;

    public Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insert("book1", 100);
        theList.insert("book2", 200);
        theList.insert("book3", 300);
        theList.insert("book4", 400);

        theList.remove();
        theList.display();

        Link search = theList.find("book1");
        System.out.print("Was found with this input : ");
        search.display();
        System.out.println();

        theList.removeLink("book1");
        theList.removeLink("book3");
        theList.removeLink("book2");

        theList.display();
    }

    public void display() {
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }
}

class LinkList {

    public Link firstLink;

    public LinkList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return firstLink == null;
    }

    public void insert(String bookName, int millionsSold) {
        Link newLink = new Link(bookName, millionsSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link remove() {
        if (!isEmpty()) firstLink = firstLink.next;
        else System.out.println("Empty LinkList");
        return firstLink;
    }

    public void display() {
        Link theLink = firstLink;

        if (theLink == null) {
            System.err.println("The LinkList is Empty");
        }

        while (theLink != null) {
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link find(String bookName) {
        Link theLink = firstLink;

        if (!isEmpty()) {
            while (!(theLink.bookName.equalsIgnoreCase(bookName))) {
                if (theLink.next == null) return null;
                else theLink = theLink.next;
            }
        } else System.err.println("EMPTY LINKLIST");

        return theLink;
    }

    public void removeLink(String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while (!(currentLink.bookName.equalsIgnoreCase(bookName))) {
            if (currentLink.next == null) return;
            else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        if (currentLink == firstLink) firstLink = firstLink.next;
        else previousLink.next = currentLink.next;
    }
}
