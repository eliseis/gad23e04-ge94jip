package gad.simplehash;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.LinkedList;
import java.util.ArrayList;

public class Hashtable<K, V> {
    private int size;
    private int[] a;
    private List<Pair<K, V>>[] table;

    @SuppressWarnings("unchecked")
    public Hashtable(int minSize, int[] a) {
        this.size = getNextPowerOfTwo(minSize);
        this.a = a;
        // TODO: Change and complete
        table = (List<Pair<K, V>>[]) new List[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public List<Pair<K, V>>[] getTable() {
        return table;
    }

    public static int getNextPowerOfTwo(int i) {
        int s = 1;
        while (s < i){
            s = s * 2;
        }
        return s;
    }

    public static int fastModulo(int i, int divisor) {
        return 0;
    }

    private byte[] bytes(K k) {
        return k.toString().getBytes(StandardCharsets.UTF_8);
    }

    public int h(K k, ModuloHelper mH) {
        byte[] x = bytes(k);
        return 0;
    }

    public void insert(K k, V v, ModuloHelper mH) {
    }

    public boolean remove(K k, ModuloHelper mH) {
        return false;
    }

    public Optional<V> find(K k, ModuloHelper mH) {
        return Optional.empty();
    }

    public List<V> findAll(K k, ModuloHelper mH) {
        return null;
    }

    public Stream<Pair<K, V>> stream() {
        return Stream.of(table).filter(Objects::nonNull).flatMap(List::stream);
    }

    public Stream<K> keys() {
        return stream().map(Pair::one).distinct();
    }

    public Stream<V> values() {
        return stream().map(Pair::two);
    }
}