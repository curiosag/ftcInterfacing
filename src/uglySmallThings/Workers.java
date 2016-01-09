package uglySmallThings;

import javax.swing.SwingWorker;

import cg.common.interfaces.Continuation;
import cg.common.threading.Function;

public class Workers {

	public static <T, U> SwingWorker<T, U> goUnderground(final Function<T> f, final Continuation<T> onDone) {
		return new SwingWorker<T, U>() {

			private T result;

			@Override
			protected T doInBackground() throws Exception {
				result = f.invoke();
				return result;
			}

			@Override
			public void done() {
				if (!isCancelled())
					onDone.invoke(result);
			};

		};
	}

	public static <T> SwingWorker<T, Object> createEmptyWorker() {
		return Workers.goUnderground(new Function<T>() {

			@Override
			public T invoke() {
				return null;
			}
		}, new Continuation<T>() {

			@Override
			public void invoke(T value) {
			}
		});

	}

}
