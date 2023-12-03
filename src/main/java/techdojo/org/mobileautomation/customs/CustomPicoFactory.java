package techdojo.org.mobileautomation.customs;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

public class CustomPicoFactory implements ObjectFactory {
    private PicoFactory delegate = new PicoFactory();
    @Override
    public void start() {
        this.delegate.start();
    }

    @Override
    public void stop() {
        this.delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return this.delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return this.delegate.getInstance(aClass);
    }
}
