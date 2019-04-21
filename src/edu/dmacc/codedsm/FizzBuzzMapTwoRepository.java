package edu.dmacc.codedsm;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzMapTwoRepository implements MapRepository {
    private Map<Integer, Result> storage = new HashMap<>();

    @Override
    public String toString() {
        return "FizzBuzzMapTwoRepository{" +
                "storage=" + storage +
                '}';
    }

    public void save(Result result) {
        storage.put(1, result);
    }


}
