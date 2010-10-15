/* scala-stm - (c) 2010, LAMP/EPFL */

package scala.concurrent.stm
package ri

class StubInTxn extends InTxn {
  import concurrent.stm.Txn._

  def rootLevel: NestingLevel = throw new AbstractMethodError
  def currentLevel: NestingLevel = throw new AbstractMethodError
  def rollback(cause: RollbackCause): Nothing = throw new AbstractMethodError
  def beforeCommit(handler: InTxn => Unit) = throw new AbstractMethodError
  def whilePreparing(handler: InTxnEnd => Unit) = throw new AbstractMethodError
  def whileCommitting(handler: InTxnEnd => Unit) = throw new AbstractMethodError
  def afterCommit(handler: Status => Unit) = throw new AbstractMethodError
  def afterRollback(handler: Status => Unit) = throw new AbstractMethodError
  def afterCompletion(handler: Status => Unit) = throw new AbstractMethodError
  def setExternalDecider(decider: ExternalDecider) = throw new AbstractMethodError
}