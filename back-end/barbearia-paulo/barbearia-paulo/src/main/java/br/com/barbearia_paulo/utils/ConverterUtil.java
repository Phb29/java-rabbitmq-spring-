package br.com.barbearia_paulo.utils;

import org.modelmapper.ModelMapper;

public class ConverterUtil<S, T> {
    private final ModelMapper modelMapeer;
    private final Class<S> sourceType;
    private final Class<T> targetType;

    public ConverterUtil(Class<S> sourceType,
                          Class<T> targetType) {
        this.modelMapeer = new ModelMapper();
        this.sourceType = sourceType;
        this.targetType = targetType;


    }

    public T convertToTarget(S source) {
        return modelMapeer.map(source, targetType);
    }

    public S convertToSource(T target) {
        return modelMapeer.map(target, sourceType);

    }
}
