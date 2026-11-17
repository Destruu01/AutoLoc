package tn.esprit.autoloc.service;

public interface IGenericService<T, K> extends ICheckGenericService<T>, IReadGenericService<T, K>, IWriteGenericService<T, K> {
}