package O5;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f5672a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int iMin;
        AbstractC1209k.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f5670a;
        String loggerName = logRecord.getLoggerName();
        AbstractC1209k.e(loggerName, "record.loggerName");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i7 = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        AbstractC1209k.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String strT0 = (String) c.f5671b.get(loggerName);
        if (strT0 == null) {
            strT0 = AbstractC1545g.t0(23, loggerName);
        }
        if (Log.isLoggable(strT0, i7)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i8 = 0;
            while (i8 < length) {
                int iW = AbstractC1545g.W(message, '\n', i8, 4);
                if (iW == -1) {
                    iW = length;
                }
                while (true) {
                    iMin = Math.min(iW, i8 + 4000);
                    AbstractC1209k.e(message.substring(i8, iMin), "this as java.lang.String…ing(startIndex, endIndex)");
                    if (iMin >= iW) {
                        break;
                    } else {
                        i8 = iMin;
                    }
                }
                i8 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
