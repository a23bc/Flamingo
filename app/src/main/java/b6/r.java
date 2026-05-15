package b6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte[] f10466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f10467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f10468q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(byte[] bArr, Context context, String str, c5.d dVar) {
        super(2, dVar);
        this.f10466o = bArr;
        this.f10467p = context;
        this.f10468q = str;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new r(this.f10466o, this.f10467p, this.f10468q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        byte[] bArr = this.f10466o;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        File file = new File(this.f10467p.getFilesDir(), "artworks");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, Z1.l.t(new StringBuilder(), this.f10468q, ".jpg"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.close();
            return Uri.fromFile(file2);
        } finally {
        }
    }
}
