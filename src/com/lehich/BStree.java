package com.lehich;
public class BStree<String extends Comparable<String>> {
    static class Node<String> {
        String key;
        Node<String> left, right;
        public Node(String key){
            this.key = key;
        }
    }

    private Node<String> root = null;
    public void insert(String st){
        Node<String> newNode = new Node(st);
        if(root==null){
            root = newNode;
            return;
        }
        Node<String> current = root;
        Node<String> parent = null;
        while(true){
            parent = current;
            if(st.compareTo(current.key) <0){
                current = current.left;
                if(current==null){
                    parent.left = newNode;
                    return;
                }
            }
                else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                }
            }
        }
    }
    public String find(String x){
        Node<String> current = root;
        while (current.key.compareTo(x) != 0){
            if(x.compareTo(current.key) < 0){
                current = current.left;
            }
            else {
                current = current.right;
            }
            if(current == null){
                return null;
            }
        }
        return current.key;
    }
    public Node<String> min(){
        Node<String> current, last = null;
        current = root;
        while (current!=null){
            last = current;
            current=current.left;
        }
        return last;
    }

    public Node<String> max(){
        Node<String> current, last = null;
        current = root;
        while (current!=null){
            last = current;
            current=current.right;
        }
        return last;
    }
}