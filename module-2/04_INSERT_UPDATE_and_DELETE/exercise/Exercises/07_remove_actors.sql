-- 7. Remove the actor appearances in "Avengers: Infinity War" (14 rows)
-- Note: Don't remove the actors themeselves, just make it so it seems no one appeared in the movie.
-- DELETE FROM person (person_name)
DELETE FROM movie_actor
WHERE movie_id(SELECT movie_id FROM movie WHERE title = 'Avengers: Infinity War')





SELECT title, person_name
FROM movie
JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
JOIN person ON movie_actor.actor_id = person.person_id
WHERE title = 'Avengers: Infinity War'




