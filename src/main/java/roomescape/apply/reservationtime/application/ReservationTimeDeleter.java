package roomescape.apply.reservationtime.application;

import org.springframework.stereotype.Service;
import roomescape.apply.reservationtime.domain.repository.ReservationTimeRepository;
import roomescape.apply.reservationtime.application.exception.NotFoundReservationTimeException;

@Service
public class ReservationTimeDeleter {

    private final ReservationTimeRepository reservationTimeRepository;

    public ReservationTimeDeleter(ReservationTimeRepository reservationTimeRepository) {
        this.reservationTimeRepository = reservationTimeRepository;
    }

    public void deleteReservationTimeBy(long id) {
        final long existId = reservationTimeRepository.checkIdExists(id).orElseThrow(NotFoundReservationTimeException::new);
        reservationTimeRepository.deleteById(existId);
    }
}
