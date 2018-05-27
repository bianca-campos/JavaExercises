package Lab5;

public class HorseBarn {
    private Horse[] spaces;


    /**
     * Constructor that takes size and inicialize a new Horse array
     * @param size size of array
     */
    public HorseBarn(int size) {
        this.spaces = new Horse[size];
    }

    /**
     * Add a new horse at the specified index
     * @param index
     * @param horse
     */
    public void addHorse(int index, Horse horse){
        if (index >= 0 && index < this.spaces.length){
            if (this.spaces[index] == null){
                this.spaces[index] = horse;
            } else {
                System.out.println("There is already a horse at the index " + index);
            }
        } else {
            System.out.println("Wrong index");
        }
    }

    /**
     * return the index of the space that contais
     * @param name
     * @return
     */
    public int findHorseSpace(String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (this.spaces[i] != null && this.spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This methos consolidate the barn by moving horses so that the horses are in adjacent spaces starting at index zero with no spaces between any horses
     */
    public void consolidate(){
        //this.spaces = {Horse, null, Horse, null, null, Horse}
        //            = {Horse, Horse, Horse, null, null, null}
        Horse[] newSpaces = new Horse[this.spaces.length];
        int i_new = 0;
        int i_old = 0;
        while (i_old < this.spaces.length){
            if (this.spaces[i_old] != null){
                newSpaces[i_new] = this.spaces[i_old];
                    i_new++;
            } else {
                i_old++;
            }
            this.spaces = newSpaces;
        }
    }

    public void displaySpaces(){

    }


}
