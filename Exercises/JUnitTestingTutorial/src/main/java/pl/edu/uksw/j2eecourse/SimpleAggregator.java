package pl.edu.uksw.j2eecourse;

/**
 * Prosty agregator liczb całkowitych, który pozwala na znalezienie 
 * średniej, sumy etc.
 */
public class SimpleAggregator {
    int sum;
    int count;
    int max;
    int min;
    double avg;

    
    /** Dodaje nową wartość do agregatora aktualizując odpowiednie 
     * zmienne stanu
     * @param value wartość która ma zostać
     */
    public void aggregate(int value) {
        sum+=value;
        if (value < min) {
            min = value;
        }
        if (value > max) {
            max = value;
        }
        avg=count*avg+value/(count+1);
        count++;
    }

    /**
     * Dodaje do agregatora wszystkie wartości z tablicy values.
     * 
     * @param values tablica liczb całkowitych które mają zostać zagregowane
     */
    public void aggregate(int[] values) {
        for (int i = 0; i < values.length; i++) {
            aggregate(i);
        }
    }
    
    
    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getAvg() {
        return avg;
    }

    public int getSum() {
        return sum;
    }
    

}
