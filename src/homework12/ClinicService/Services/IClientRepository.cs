using ClinicService.Models;

namespace ClinicService.Services
{
    /// <summary>
    /// Конкретный тип интерфейса репозитория для работы со справочником клиентов в БД
    /// </summary>
    public interface IClientRepository : IRepository<Client, int>
    {

    }
}
