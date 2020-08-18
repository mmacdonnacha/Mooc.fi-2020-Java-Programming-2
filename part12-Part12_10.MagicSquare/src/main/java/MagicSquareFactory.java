
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int column = (square.getWidth() / 2);
        int row = 0;
        

        for(int number=1; number<=Math.pow(size, 2); number++){
            
            // place value
            square.placeValue(column, row, number);            
            
            
            // Up one row and right one column
            int nextRow = (row - 1) >= 0 ? row - 1 : square.getHeight() - 1;
            int nextColumn = (column + 1) < square.getHeight() ? column + 1 : 0;

            if (square.readValue(nextColumn, nextRow) != 0) {
                // go down one row
                nextRow = (row + 1) < square.getHeight() ? row + 1 : 0;
                nextColumn = column;
            }
            
            row = nextRow;
            column = nextColumn;
        }

        return square;
    }

}
