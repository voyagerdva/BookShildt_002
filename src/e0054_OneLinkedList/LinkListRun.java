package e0054_OneLinkedList;

import jdk.swing.interop.SwingInterOpUtils;

public class LinkListRun {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------------------");

        LinkList linkList = new LinkList();


        String data[] = {"11", "22", "33", "44", "55", "66"};

        for (String item: data) {
            linkList.add(item);
            addNodeAndPrint(linkList, item);
        }

        linkList.printList();
    }


    public static void addNodeAndPrint(LinkList linkList, String data){
        System.out.printf("%-40s %-50s\n", data + " - linkList.tail:", ((LinkList) linkList).tail);
        System.out.printf("%-40s %-50s\n", data + " - linkList.currentNode:", ((LinkList) linkList).currentNode);
        System.out.printf("%-40s %-50s\n", data + " - linkList.head:", ((LinkList) linkList).head);
        System.out.printf("%-40s %-50s\n", data + " - linkList.head.value:", ((LinkList) linkList).head.value);
        System.out.printf("%-40s %-50s\n", data + " - linkList.currentNode value:", ((LinkList) linkList).currentNode.value);
        System.out.println("-----");
    }
}

