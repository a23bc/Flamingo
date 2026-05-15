package W1;

import Z1.l;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ByteOrder f7731s = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ByteOrder f7732t = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DataInputStream f7733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteOrder f7734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f7736r;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f7733o.available();
    }

    public final void b(int i7) throws IOException {
        int i8 = 0;
        while (i8 < i7) {
            DataInputStream dataInputStream = this.f7733o;
            int i9 = i7 - i8;
            int iSkip = (int) dataInputStream.skip(i9);
            if (iSkip <= 0) {
                if (this.f7736r == null) {
                    this.f7736r = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f7736r, 0, Math.min(8192, i9));
                if (iSkip == -1) {
                    throw new EOFException(l.o(i7, "Reached EOF while skipping ", " bytes."));
                }
            }
            i8 += iSkip;
        }
        this.f7735q += i8;
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f7735q++;
        return this.f7733o.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f7735q++;
        return this.f7733o.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f7735q++;
        int i7 = this.f7733o.read();
        if (i7 >= 0) {
            return (byte) i7;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f7735q += 2;
        return this.f7733o.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i7, int i8) throws IOException {
        this.f7735q += i8;
        this.f7733o.readFully(bArr, i7, i8);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f7735q += 4;
        DataInputStream dataInputStream = this.f7733o;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i7 | i8 | i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7734p;
        if (byteOrder == f7731s) {
            return (i10 << 24) + (i9 << 16) + (i8 << 8) + i7;
        }
        if (byteOrder == f7732t) {
            return (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f7734p);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j3;
        long j7;
        this.f7735q += 8;
        DataInputStream dataInputStream = this.f7733o;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        if ((i7 | i8 | i9 | i10 | i11 | i12 | i13 | i14) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7734p;
        if (byteOrder == f7731s) {
            j3 = (((long) i14) << 56) + (((long) i13) << 48) + (((long) i12) << 40) + (((long) i11) << 32) + (((long) i10) << 24) + (((long) i9) << 16) + (((long) i8) << 8);
            j7 = i7;
        } else {
            if (byteOrder != f7732t) {
                throw new IOException("Invalid byte order: " + this.f7734p);
            }
            j3 = (((long) i7) << 56) + (((long) i8) << 48) + (((long) i9) << 40) + (((long) i10) << 32) + (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8);
            j7 = i14;
        }
        return j3 + j7;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f7735q += 2;
        DataInputStream dataInputStream = this.f7733o;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7734p;
        if (byteOrder == f7731s) {
            return (short) ((i8 << 8) + i7);
        }
        if (byteOrder == f7732t) {
            return (short) ((i7 << 8) + i8);
        }
        throw new IOException("Invalid byte order: " + this.f7734p);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f7735q += 2;
        return this.f7733o.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f7735q++;
        return this.f7733o.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f7735q += 2;
        DataInputStream dataInputStream = this.f7733o;
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f7734p;
        if (byteOrder == f7731s) {
            return (i8 << 8) + i7;
        }
        if (byteOrder == f7732t) {
            return (i7 << 8) + i8;
        }
        throw new IOException("Invalid byte order: " + this.f7734p);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(InputStream inputStream, int i7) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f7734p = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f7733o = dataInputStream;
        dataInputStream.mark(0);
        this.f7735q = 0;
        this.f7734p = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f7733o.read(bArr, i7, i8);
        this.f7735q += i9;
        return i9;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f7735q += bArr.length;
        this.f7733o.readFully(bArr);
    }
}
