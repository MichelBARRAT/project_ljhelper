package fr.project.ljhelper;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    public Tree tree;

    public Sort sort;

    public ArrayList<Tree> treeList = new ArrayList<Tree>();

    Scanner scan = new Scanner(System.in);

    public void test() {

        sort = new Sort();
        String prog;
        System.out.println("Arbre ? o/n");
        prog = scan.next();

        while (prog.equals("o")) {

            tree = new Tree();
            System.out.println("Essence ?");
            tree.setEssence(scan.next().toLowerCase());
            System.out.println("Hauteur ?");
            tree.setHight(scan.nextDouble());
            System.out.println("Diametre ?");
            tree.setDiameter(scan.nextDouble());
            treeList.add(tree);
            System.out.println(treeList);
            System.out.println("Arbre ? o/n");
            prog = scan.next();
        }
        sort.sortTree(treeList);
    }

}
