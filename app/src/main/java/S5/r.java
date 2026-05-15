package S5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public class r extends l {
    @Override // S5.l
    public final void a(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = uVar.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + uVar);
    }

    @Override // S5.l
    public final List d(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "dir");
        File fileE = uVar.e();
        String[] list = fileE.list();
        if (list == null) {
            if (fileE.exists()) {
                throw new IOException("failed to list " + uVar);
            }
            throw new FileNotFoundException("no such file: " + uVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC1209k.c(str);
            arrayList.add(uVar.d(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // S5.l
    public B3.a f(u uVar) {
        AbstractC1209k.f(uVar, "path");
        File fileE = uVar.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileE.exists()) {
            return new B3.a(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // S5.l
    public final q g(u uVar) {
        return new q(new RandomAccessFile(uVar.e(), "r"));
    }

    @Override // S5.l
    public final C h(u uVar) {
        AbstractC1209k.f(uVar, "file");
        File fileE = uVar.e();
        Logger logger = t.f6809a;
        return new C0423c(new FileOutputStream(fileE, false), 1, new G());
    }

    @Override // S5.l
    public final E i(u uVar) {
        AbstractC1209k.f(uVar, "file");
        File fileE = uVar.e();
        Logger logger = t.f6809a;
        return new C0424d(new FileInputStream(fileE), G.f6762d);
    }

    public void j(u uVar, u uVar2) throws IOException {
        AbstractC1209k.f(uVar, "source");
        AbstractC1209k.f(uVar2, "target");
        if (uVar.e().renameTo(uVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + uVar + " to " + uVar2);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
