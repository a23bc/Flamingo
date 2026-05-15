package O3;

import N3.p;
import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5637a;

    static {
        p.i("WrkDbPathHelper");
        f5637a = new String[]{"-journal", "-shm", "-wal"};
    }

    public static void a(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            p.d().b(new Throwable[0]);
            HashMap map = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath, file);
            for (String str : f5637a) {
                map.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            for (File file2 : map.keySet()) {
                File file3 = (File) map.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        String.format("Over-writing contents of %s", file3);
                        p.d().j(new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        String.format("Migrated %s to %s", file2, file3);
                    } else {
                        String.format("Renaming %s to %s failed", file2, file3);
                    }
                    p.d().b(new Throwable[0]);
                }
            }
        }
    }
}
