package models

import anorm.Pk

case class Posts(
    id: Pk[Long],
    title: String,
    description: String
)

object Posts {
    def all(): List[Posts] = Nil

    def create(title: String, description: String) {}

    def delete(id: Long) {}
}
