package LC;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 @author Myvin Barboza
 28/04/20 5:32 PM 
 */
public class FirstUnique {
    Set<Integer> unique;
    Set<Integer> duplicate;

    //2,3,5,5,2,3 5,5   u=
    //d=5,2,3
    public FirstUnique(int[] nums) {
        unique = new LinkedHashSet<>();
        duplicate = new HashSet<>();
        for (int a : nums) {
            add(a);
        }
        System.out.println(unique);
        System.out.println(duplicate);
    }

    public int showFirstUnique() {
        if (!unique.isEmpty()) return unique.iterator().next();
        else return -1;
    }

    public void add(int value) {
        if(!duplicate.contains(value)){
            if (unique.contains(value)) {
                unique.remove(value);
                duplicate.add(value);
            } else  {
                unique.add(value);
            }
        }


    }
/*
* ["FirstUnique","add","add","add","add","add","showFirstUnique","add","showFirstUnique","add","add","add","add","add","add","add","showFirstUnique","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","showFirstUnique","showFirstUnique","add","showFirstUnique","showFirstUnique","add","add","showFirstUnique","showFirstUnique","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","showFirstUnique","add","add","add","add","showFirstUnique","add","add","add","add","add","add","add","add","add","add","add","add","add","showFirstUnique","add","add","showFirstUnique","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","add","showFirstUnique","add","add","showFirstUnique","add","add","showFirstUnique","add","add","add","add","add","add","add","add","add","add","add","add","showFirstUnique"]

[[[698,866,349,680,733,916,961,652,161,960,417,813,474,170,802,406,442,454,780,886,899,367,786,157,953,621,29,273,485,55,563,275,343,157,715,683,608,932,874,241,796,877,845,26,719,167,415,287,411,95,196,118,291,811,969,27,805,323,707,625,651,588,445,690,706,694,317,978,327,764,366,18,104,753,791,94,912,171,923,969,457,717,694,147,329,12,84,650,592,383,506,924,939,495,999,120,529,117,446,830,740,108,791,518,83,164,606,172,783,808]],[657],[942],[901],[1000],[538],[],[390],[],[568],[608],[320],[508],[241],[360],[708],[],[182],[677],[591],[235],[890],[527],[294],[584],[747],[169],[342],[763],[246],[785],[76],[868],[177],[],[],[699],[],[],[342],[724],[],[],[973],[486],[814],[75],[697],[24],[454],[393],[667],[153],[490],[437],[536],[597],[794],[681],[],[338],[110],[360],[235],[],[541],[420],[399],[49],[444],[828],[583],[964],[39],[162],[896],[880],[456],[],[758],[442],[],[557],[100],[501],[863],[737],[621],[998],[637],[48],[88],[931],[146],[803],[109],[350],[859],[821],[875],[713],[260],[582],[230],[944],[173],[604],[498],[],[543],[33],[],[421],[413],[],[665],[722],[364],[306],[589],[1000],[338],[669],[477],[190],[665],[594],[]]
*/

    public static void main(String[] args) {
        int a[]={8,2,3,5,5,5,2,3,1,1,1,1,1,9};
        FirstUnique firstUnique = new FirstUnique(a);

//        System.out.println(firstUnique.showFirstUnique()); // return 2
//        firstUnique.add(5);            // the queue is now [2,3,5,5]
//        System.out.println(firstUnique.showFirstUnique()); // return 2
//        firstUnique.add(2);            // the queue is now [2,3,5,5,2]
//        System.out.println(firstUnique.showFirstUnique()); // return 3
//        firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
//        System.out.println(firstUnique.showFirstUnique()); // return -1
    }
}