package com.latihan;

public class PohonPencarianBiner
{

    class Node
    {
        int key;
        Node kiri, kanan;
        public Node(int item)
        {
            key = item;
            kiri = kanan = null;
        }
    }

    Node root;

    PohonPencarianBiner()
    {
        root = null;
    }

    void insert(int key)
    {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key)
    {
        if ( root == null )
        {
            root = new Node(key);
            return root;
        }
        else if ( key < root.key)
        {
            root.kiri = insertRec(root.kiri, key);
        }
        else
        {
            root.kanan = insertRec(root.kanan, key);
        }
        return root;
    }

    void inorder() { inorderRec(root); }

    void inorderRec(Node root)
    {
        if ( root != null )
        {
            inorderRec(root.kiri);
            System.out.println(root.key);
            inorderRec(root.kanan);
        }
    }

    public static void main(String[] args)
    {
        PohonPencarianBiner pohon = new PohonPencarianBiner();
        int array[] = {2,4,11,7,3,1,8,99,56,49};
        for (int i : array){ pohon.insert(i); }
        pohon.inorder();
    }
}
