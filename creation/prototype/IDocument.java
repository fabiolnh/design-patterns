package creation.prototype;

public interface IDocument extends Cloneable {
    IDocument clone();
    void print();
}
