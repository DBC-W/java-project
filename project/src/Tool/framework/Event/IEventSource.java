package Tool.framework.Event;

public interface IEventSource<T> {
    void Trigger(T obj);

    void Register(IEventListener<T> listener);

    void Unregister(IEventListener<T> listener);
}
