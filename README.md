# camel-exceptions-data
Extensions to camel-exceptions-core providing additional Exceptions for data-wrangling problems.

Releases are hosted over at [bintray](https://bintray.com/capgeminiuk/maven/camel-exceptions-data/view) licenced under Apache v.2.0.

It's recommended when you're handling exceptions in Apache Camel that you differentiate between recoverable and irrecoverable exceptions.  These classes take the representations of these two types of exception (from [camel-exceptions-core](https://github.com/andrewharmellaw/camel-exceptions-core)) and create data-wrangling-specific subclasses.  (By data-wrangling, we mean things like validation, conversion, etc.)

They are very simple, extending the relevant Recoverable or IrrecoverableException, and providing a meaningful classname.  Nothing beyond that.  

Isn't it nice when someone does a bunch of your typing for you?
