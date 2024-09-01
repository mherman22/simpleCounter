public class SequenceCounter extends Counter {
   private String[] sequence; // Array to hold the sequence of strings
   private int index; // Index to track the current position in the sequence

   // Constructor to initialize the sequence and set the index to 0
   public SequenceCounter(String[] aSequence) {
      sequence = aSequence;
      index = 0;
   }

   // Increment method to move to the next element in the sequence
   public void increment() {
      index = (index + 1) % sequence.length;
   }

   // Decrement method to move to the previous element in the sequence
   public void decrement() {
      index = (index - 1 + sequence.length) % sequence.length;
   }

   // Reset method to set the index back to the first element
   public void reset() {
      index = 0;
   }

   // Method to return the current element as a string
   public String valueAsString() {
      return sequence[index];
   }
}
