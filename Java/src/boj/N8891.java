import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static class DotXY {
        final int x;
        final int y;

        DotXY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while(testCase-- > 0) {
            String[] sqlit = br.readLine().split(" ");
            int dotNumber1 = Integer.parseInt(sqlit[0]);
            int dotNumber2 = Integer.parseInt(sqlit[1]);

            int dot1LineNumber = getLineNumber(dotNumber1);
            int dot1MaxDotNumber = getMaxDotNumber(dot1LineNumber);
            int dot1MinDotNumber = getMinDotNumber(dot1LineNumber);
            DotXY dotXY1 = getDotXY(dotNumber1, dot1MaxDotNumber, dot1MinDotNumber, dot1LineNumber);

            int dot2LineNumber = getLineNumber(dotNumber2);
            int dot2MaxDotNumber = getMaxDotNumber(dot2LineNumber);
            int dot2MinDotNumber = getMinDotNumber(dot2LineNumber);

            DotXY dotXY2 = getDotXY(dotNumber2, dot2MaxDotNumber, dot2MinDotNumber, dot2LineNumber);

            DotXY destDotXY = new DotXY(dotXY1.x + dotXY2.x, dotXY1.y + dotXY2.y);

            int destLineNumber = getLineNumber(destDotXY);
            int destMaxDotNumber = getMaxDotNumber(destLineNumber);
            int destDotNumber = destMaxDotNumber - destDotXY.y + 1;
            System.out.println(destDotNumber);
        }
    }


    static final int getLineNumber(DotXY dotXY) {
        return dotXY.x + dotXY.y - 1;
    }

    static final int getLineNumber(int dotNumber) {
        return (int) Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * dotNumber)) / 2);
    }

    static final int getMaxDotNumber(int lineNumber) {
        return (lineNumber + 1) * lineNumber / 2;
    }

    static final int getMinDotNumber(int lineNumber) {
        return (lineNumber - 1) * lineNumber / 2 + 1;
    }

    final static DotXY getDotXY(int dotNumber, int maxDotNumber, int minDotNumber, int lineNumber) {
        return new DotXY(
                lineNumber - (maxDotNumber - dotNumber),
                lineNumber - (dotNumber - minDotNumber)
        );
    }
}
