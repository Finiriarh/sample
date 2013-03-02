package models

/**
 * @author Dmitry Tikhonov
 *         Date: 2/16/13
 *         Time: 7:59 PM
 */
case class Task(id: Long, label: String)

object Task {
  var taskMap: Map[Long, Task] = Map[Long, Task]()
  var inc: Long = 0

  def all = taskMap.values.toList

  def create(label: String) {
    taskMap = taskMap + (inc -> Task(inc, label))
    inc += 1
  }

  def delete(id: Long) {
    taskMap -= id
  }

}
