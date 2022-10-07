/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.*;
import java.util.HashMap;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */

    public boolean addDrivable(String id, Drivable object){
        if (!drivable_map.containsKey(id)){
            drivable_map.put(id, object);
        }
        return true;
    }

    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */

    public boolean hasFasterThan(int speed){
        for (String i : drivable_map.keySet()){
            if (drivable_map.get(i).getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }

    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */

    public List getTradable() {
        List<Tradable> list = new ArrayList<Tradable>();
        for (String i : drivable_map.keySet()){
            if (drivable_map.get(i) instanceof Tradable){
                list.add((Tradable) drivable_map.get(i));
            }
        }
        return list;
    }

}
