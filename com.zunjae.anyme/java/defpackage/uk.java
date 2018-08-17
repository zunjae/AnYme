package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

final class uk {
    private static final FilenameFilter a = new ul();

    static int a(File file, int i, Comparator<File> comparator) {
        return uk.a(file, a, i, comparator);
    }

    static int a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        int i2 = 0;
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        Arrays.sort(listFiles, comparator);
        int length2 = listFiles.length;
        while (i2 < length2) {
            File file2 = listFiles[i2];
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
            i2++;
        }
        return length;
    }
}
