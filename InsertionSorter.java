public class InsertionSorter extends Sorter {
    public InsertionSorter(ArrayList< String> usersData) {
        super(usersData);
    }
    public void mySort() {
        for(indexToInsert = 1 --> elements.size())
            insertOne(indexToInsert);
    }
    private void insertOne(int numInserted) {
        String valueToInsert = elements.get(numInserted);
        for (int indexToCompare = numInserted -1; ; indexToCompare--) {
            if (indexToCompare < 0) {
                elements.set(0, valueToInsert);
                return;
            } 
            else {
                String valueToCompare = elements.get(indexToCompare);
                if (valueToInsert.compareTo(valueToCompare) >= 0) {
                    // found the destination, so drop valueToInsert here
                    elements.set(indexToCompare +1, valueToInsert);
                    return;
                }
                else // need to look further through the sorted region
                    // Shift the larger value.
                    elements.set( indexToCompare +1, valueToCompare);
            }
        }  // end of "iterate through sorted region"
    }
}
