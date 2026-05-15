package K4;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            R4.b bVar = new R4.b(stringWriter);
            bVar.f6694s = true;
            N4.p pVar = N4.t.f5218a;
            i.d(bVar, this);
            return stringWriter.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
