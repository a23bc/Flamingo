package K4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f4051b;

    public /* synthetic */ j(x xVar, int i7) {
        this.f4050a = i7;
        this.f4051b = xVar;
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        switch (this.f4050a) {
            case 0:
                return new AtomicLong(((Number) this.f4051b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.o()) {
                    arrayList.add(Long.valueOf(((Number) this.f4051b.a(aVar)).longValue()));
                }
                aVar.h();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i7 = 0; i7 < size; i7++) {
                    atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.E() != 9) {
                    return this.f4051b.a(aVar);
                }
                aVar.A();
                return null;
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        switch (this.f4050a) {
            case 0:
                this.f4051b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.c();
                int length = atomicLongArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    this.f4051b.b(bVar, Long.valueOf(atomicLongArray.get(i7)));
                }
                bVar.h();
                break;
            default:
                if (obj == null) {
                    bVar.o();
                } else {
                    this.f4051b.b(bVar, obj);
                }
                break;
        }
    }
}
