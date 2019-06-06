package fr.project.ljhelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sort {

    public void sortTree(ArrayList<Tree> treeList) {

        Map<String, ArrayList<Tree>> treeMap = new HashMap<String, ArrayList<Tree>>();

        for (Tree tree : treeList) {

            String essence = tree.getEssence();
            ArrayList<Tree> treeMapVerif = treeMap.get(essence);

            if (treeMapVerif == null) {
                ArrayList<Tree> essenceList = new ArrayList<Tree>();
                essenceList.add(tree);
                treeMap.put(essence, essenceList);
            } else {
                treeMapVerif.add(tree);
            }

        }
        System.out.println(treeMap);
    }
}