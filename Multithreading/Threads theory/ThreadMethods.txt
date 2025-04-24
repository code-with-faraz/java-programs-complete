Method	   Description
start()	   Starts a thread, moving it from NEW to RUNNABLE.
run()      Defines the thread's logic but should not be called directly.
sleep(ms)  Pauses execution for a given milliseconds (moves to TIMED WAITING).
yield()	   Suggests the scheduler give CPU time to other threads.
join()	   Makes the current thread wait for another thread to finish.

setName("name") / getName()	        Sets or gets the thread’s name.
setPriority(int) / getPriority()	Sets or gets the thread’s priority (1 to 10).

interrupt()	 Interrupts a sleeping or waiting thread.
isAlive()	 Checks if a thread is still running.