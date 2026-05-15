package K0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f3848p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n7, c5.d dVar) {
        super(2, dVar);
        this.f3848p = n7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new M(this.f3848p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f3847o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            N n7 = this.f3848p;
            n7.getClass();
            PointerInputEventHandler pointerInputEventHandler = n7.f3852F;
            this.f3847o = 2;
            if (pointerInputEventHandler.invoke(n7, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
